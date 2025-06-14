document.addEventListener("DOMContentLoaded", () => {
    const selectorPeliculas = document.getElementById("selector-peliculas");
    const selectorFunciones = document.getElementById("selector-funciones");
    const selectorEntradas = document.getElementById("selector-Entrada");
  
    const tdPelicula = document.getElementById("td-pelicula");
    const tdHorario = document.getElementById("td-horario");

    const tdAsiento = document.getElementById("td-Asiento");
    const tdPrecio = document.getElementById("td-Precio");
  
    let peliculaSeleccionada = null;
    let funcionSeleccionada = null;
    let entradaSeleccionada = null;
  
    // 1. Cargar películas al iniciar
    fetch('http://localhost:9000/api/peliculas')
      .then(res => res.json())
      .then(peliculas => {
        selectorPeliculas.innerHTML = '<option value="">Seleccioná una película</option>';
        peliculas.forEach(p => {
          const option = document.createElement('option');
          option.value = p.id;
          option.textContent = p.titulo;
          selectorPeliculas.appendChild(option);
        });
      });
  
    // 2. Al seleccionar película, cargar funciones
    selectorPeliculas.addEventListener("change", () => {
      const id = selectorPeliculas.value;
      if (!id) return;

      fetch(`http://localhost:9000/api/funciones/pelicula/buscar?id=${id}`) //id de la película para traer sus funciones
        .then(res => res.json())
        .then(funciones => {
          selectorFunciones.innerHTML = '<option value="">Seleccioná una Función</option>';
          funciones.forEach(f => {
            const option = document.createElement('option');
            option.value = f.id; 
            option.textContent = f.horario;
            selectorFunciones.appendChild(option);
          });
        });
    });
  
    // 3. Al seleccionar función, cargar entradas
    selectorFunciones.addEventListener("change", () => {
      const id = selectorFunciones.value;
      if (!id) return;
  
      fetch(`http://localhost:9000/api/funciones/pelicula/buscar/entradas?id=${id}`) //este id debe ser el de la función que se selecciono más arriba 
        .then(res => res.json())
        .then(entradas => {
          selectorEntradas.innerHTML = '<option value="">Seleccioná una entrada</option>';
          entradas.forEach(e => {
            const option = document.createElement('option');
            option.value = e.monto;
            option.textContent = `Asiento ${e.asiento} - $${e.precio}`;
            selectorEntradas.appendChild(option);
          });
        });
    });
  });
  
   document.getElementById("form-compra").addEventListener("submit", comprarEntrada);

   function comprarEntrada(event) {
    event.preventDefault();
     const nombre = document.getElementById("nombreusuario").value;
     const correo = document.getElementById("correousuario").value;
     const tipoPago = document.getElementById("tipo-pago").value;
     const montodinero = document.getElementById("selector-Entrada").value;
     const funcionId = document.getElementById("selector-funciones").value;
 
     if (!nombre || !correo || !tipoPago || !montodinero || !funcionId) {
       alert("Completá todos los campos y seleccioná función y entrada.");
       return;
     }
 
     const Venta = {
        fecha: new Date().toISOString(),
        monto: parseInt(montodinero),
        tipo: tipoPago,
        nombre: nombre,
        correo: correo,
        funcionId: parseInt(funcionId)
    };
     fetch("http://localhost:9000/api/ventas/crear", {
       method: "POST",
       headers: {
         "Content-Type": "application/json"
       },
       body: JSON.stringify(Venta)
     })
       .then(res => {
         if (res.ok) {
           alert("🎉 Compra realizada con éxito");
           document.getElementById("form-compra").reset();
         } else {
           alert("❌ Error al realizar la compra");
         }
       })
       .catch(error => {
         console.error("Error de red:", error);
         alert("⚠️ No se pudo conectar con el servidor");
       });
   }
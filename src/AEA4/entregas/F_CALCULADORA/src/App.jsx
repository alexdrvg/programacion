import { useState } from 'react'
import './App.css'
import iconoHistorial from './assets/reloj.png' /* importamos imagen del reloj de hist */

function App() {

  const [valorActual, setValorActual] = useState("0");
  const [valorAnterior, setValorAnterior] = useState("0");
  const [operador, setOperador] = useState(null);
  const [historial, setHistorial] = useState([]);
  const [mostrarHistorial, setMostrarHistorial] = useState(false);


  /* FUNCIÓN PARA CUANDO SE PULSA UN NUMERO Y ACTUALIZARLO EN EL PANEL*/
  const pulsarBoton = (num) => {
    if (valorActual === "0" && num !== '.') {
      setValorActual(num);
    } else {
      if (valorActual.includes('.') && num === '.') {
        return; /* si el string valor actual ya contiene un . , no dejamos que vuelva a escribir al no retornar nada*/
      }
      setValorActual(valorActual + num);
    }
  };

  
  /* LOGICA DEL HISTORIAL PARA EL RETURN */
  let cajaHistorial; 
  
  if (mostrarHistorial === true) {
    cajaHistorial = (
      <div className='historial-flotante'>
        {historial.map((el, i) => <div key={i} className='item-historial'>{el}</div>)}
      </div>
    );
    /* elemento 'el' 2+2, indice 'i' posicion array */
  }


  /* FUNCIÓN PARA BORRAR EL NUMERO ANTERIOR + BORRAR TODO */
  const borrarNumAnterior = () => {
    if (valorActual === "0" || valorActual === "Error") {
      if (operador !== null) {
        const numLimpio = parseFloat(valorAnterior); /* le quitamos el operador */
        setValorActual(numLimpio.toString()); /* y lo bajamos de arriba a abajo en valor actual */
        setValorAnterior("0");
        setOperador(null); 
      }
    } else if (valorActual.length === 1) {
      setValorActual("0");
    } else {
      setValorActual(valorActual.slice(0, -1)); /* corta todo el string valor como si fuera un array y olvida el ultimo al poner el -1*/
    }
  };
    
  const borrarTodo = () => {
    setValorActual("0");
    setValorAnterior("0");
    setOperador(null);
  };

  
  /* FUNCIÓN PARA CUANDO SE PRESIONE EL OPERADOR DESPUÉS DEL VALOR INICIAL */

  const pulsarOperador = (signo) => {
    setOperador(signo); /* se cambia de null al signo que haya clicado */

    if (valorAnterior === "0") {
      setValorAnterior(valorActual + signo); /* llamamos a la función para cambiar el valor valAnterior, x el valorar actual que habia en la variable */
      setValorActual("0"); /* volvemos al cero del incio de la calculadora */
    } else {
      let resultado;
      let numAnterior = parseFloat(valorAnterior);
      let numActual = parseFloat(valorActual);

      if (operador === '/') {
        resultado = numAnterior / numActual;
      } else if (operador === '*') {
        resultado = numAnterior * numActual;
      } else if (operador === '+') {
        resultado = numAnterior + numActual;
      } else if (operador === '-') {
        resultado = numAnterior - numActual;
      }

      /*manejo de error al calcular x si hacen 3/0 etc*/
      if (!isFinite(resultado) || isNaN(resultado)) {
        setValorAnterior("0");
        setValorActual("Error");
        setOperador(null);
      }

      if (!Number.isInteger(resultado)) {
        resultado = parseFloat(resultado.toFixed(4)); /* se vuelve a usar el parsefloat x el tofixed porq devuelve string */
      } 

      setValorAnterior(resultado + operador);
      setValorActual("0");
    }
  };
  
  /* FUNCIÓN FINAL AL DARLE = RESULTADO */
  const operacion = () => {
    let resultado;
    let numAnterior = parseFloat(valorAnterior);
    let numActual = parseFloat(valorActual);

    if (operador === '/') {
      resultado = numAnterior / numActual;
    } else if (operador === '*') {
      resultado = numAnterior * numActual;
    } else if (operador === '+') {
      resultado = numAnterior + numActual;
    } else if (operador === '-') {
      resultado = numAnterior - numActual;
    }

    if (!isFinite(resultado) || isNaN(resultado)) {
      setValorAnterior("0");
      setValorActual("Error");
      setOperador(null);
      return;
    }

    if (!Number.isInteger(resultado)) {
      resultado = parseFloat(resultado.toFixed(4));
    }

    const operacionCompleta = `${valorAnterior} ${valorActual} = ${resultado}`;
    setHistorial([operacionCompleta, ...historial]); /* guardamos y apilamos las op */

    setValorAnterior("0"); /* borramos lo que hay arriba del panel*/
    setValorActual(resultado.toString()); /* enseñamos resultado final */
  };

  return (
    <div className='grid-calculadora'>
      <div className='panel'>
        <div className='grid-historial' onMouseEnter={() => setMostrarHistorial(true)} onMouseLeave={() => setMostrarHistorial(false)}>
          <button className='boton-historial'>
            <img src={iconoHistorial} alt="reloj" className="icono-reloj" />
          </button>
          {cajaHistorial}
        </div>

        <div className='numeros-anteriores'>{valorAnterior}</div>
        <div className='numeros-actuales'>{valorActual}</div>
      </div>
      <button className='borrar-todo' onClick={() => {setValorActual("0"); setValorAnterior("0"); setOperador(null);}}>AC</button>
      <button className='borrar' onClick={borrarNumAnterior}>⌫</button>
      <button className='dividir' onClick={() => pulsarOperador('/')}>÷</button>
      <button onClick={() => pulsarBoton("1")}>1</button>
      <button onClick={() => pulsarBoton("2")}>2</button>
      <button onClick={() => pulsarBoton("3")}>3</button>
      <button className='multiplicar' onClick={() => pulsarOperador('*')}>×</button>
      <button onClick={() => pulsarBoton("4")}>4</button>
      <button onClick={() => pulsarBoton("5")}>5</button>
      <button onClick={() => pulsarBoton("6")}>6</button>
      <button className='sumar' onClick={() => pulsarOperador('+')}>+</button>
      <button onClick={() => pulsarBoton("7")}>7</button>
      <button onClick={() => pulsarBoton("8")}>8</button>
      <button onClick={() => pulsarBoton("9")}>9</button>
      <button className='restar' onClick={() => pulsarOperador('-')}>-</button>
      <button onClick={() => pulsarBoton(".")}>.</button>
      <button onClick={() => pulsarBoton("0")}>0</button>
      <button className='igual' onClick={operacion}>=</button>
    </div>
  );
}

export default App;
// Importar módulo React
import React from 'react';

// Importar CSS
import './estilos.css';

// Importar imagens
import bitcoin from './imagens/bitcoin.jpg';
import ethereum from './imagens/ethereum.png';
import xrp from './imagens/xrp.png';
import litecoin from './imagens/litecoin.jpg';

// Clase
export default class App extends React.Component{

  // Construtor
  constructor(props){
    super(props);

    this.state = {
      bitcoin : 0,
      ethereum : 0,
      xrp : 0,
      litecoin : 0
    }
  }

  // Antes de criar o componente
  componentDidMount(){

    // Bitcoin
    setInterval(() => {
      fetch('https://www.mercadobitcoin.net/api/BTC/ticker/')
      .then(dados => dados.json())
      .then(dados => this.setState({bitcoin : dados.ticker.buy}))
    }, 5000);

        // Ethereum
        setInterval(() => {
          fetch('https://www.mercadobitcoin.net/api/ETH/ticker/')
          .then(dados => dados.json())
          .then(dados => this.setState({ethereum : dados.ticker.buy}))
        }, 5000);

       // XRP
       setInterval(() => {
        fetch('https://www.mercadobitcoin.net/api/XRP/ticker/')
        .then(dados => dados.json())
        .then(dados => this.setState({xrp : dados.ticker.buy}))
      }, 5000);     

            // Litecoin
    setInterval(() => {
      fetch('https://www.mercadobitcoin.net/api/LTC/ticker/')
      .then(dados => dados.json())
      .then(dados => this.setState({litecoin : dados.ticker.buy}))
    }, 5000);

  }

// Render
render(){
  return(
    <div className='container'>
       <div className='row'>
         <div className='col-xl-3 col-md-4 col-sm-6'>
         <div className='card'>
        <img src={bitcoin} />   
       <p>Bitcoin</p>
       <p>R${Number(this.state.bitcoin).toFixed(2).replace('.', ',').replace(/(\d)(?=(\d{3})+\,)/g, "$1.")}</p>
          </div>
        </div>

        <div className='col-xl-3 col-md-4 col-sm-6'>
         <div className='card'>
        <img src={ethereum} />   
        <p>Ethereum</p>
       <p>R${Number(this.state.ethereum).toFixed(2).replace('.', ',').replace(/(\d)(?=(\d{3})+\,)/g, "$1.")}</p>
          </div>
        </div>

        <div className='col-xl-3 col-md-4 col-sm-6'>
         <div className='card'>
        <img src={xrp} />   
        <p>XRP</p>
       <p>R${Number(this.state.xrp).toFixed(2).replace('.', ',').replace(/(\d)(?=(\d{3})+\,)/g, "$1.")}</p>
          </div>
        </div>

        <div className='col-xl-3 col-md-4 col-sm-6'>
         <div className='card'>
        <img src={litecoin} />   
        <p>Litecoin</p>
       <p>R${Number(this.state.litecoin).toFixed(2).replace('.', ',').replace(/(\d)(?=(\d{3})+\,)/g, "$1.")}</p>
          </div>
        </div>
      </div>
      </div>
  );

}

}


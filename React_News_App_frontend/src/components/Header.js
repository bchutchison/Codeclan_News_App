import React, { Component } from 'react';
import NavBar from './NavBar.js';
import './css/Header.css';

class Header extends Component {
  render() {
    return (
      <>
       <header>
        <img className="logo" src={require("./loudspeaker.png")}/>
        <h1>What's Going On</h1>
       </header>
      </>
    );
  }
}

export default Header;



//hoping the git issue is resolved

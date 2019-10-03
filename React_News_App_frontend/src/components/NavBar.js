import React from 'react';
import './css/NavBar.css';
import {Link} from "react-router-dom";


class NavBar extends React.Component {
constructor(){
 super();

 this.state = {
       displayMenu: false,
     };

  this.showDropdownMenu = this.showDropdownMenu.bind(this);
  this.hideDropdownMenu = this.hideDropdownMenu.bind(this);

};

showDropdownMenu(event) {
    event.preventDefault();
    this.setState({ displayMenu: true }, () => {
    document.addEventListener('click', this.hideDropdownMenu);
    });
  }

  hideDropdownMenu() {
    this.setState({ displayMenu: false }, () => {
      document.removeEventListener('click', this.hideDropdownMenu);
    });

  }

  render() {
    return (
        <div  className="menu-dropdown" >
         <button className="menu-button" onClick={this.showDropdownMenu}> Admin</button>

          { this.state.displayMenu ? (
          <ul>
         <li><Link style={{ textDecoration: 'none', color: 'white', position: 'right' }} to="/" >Home</Link></li>

         <li><Link style={{ textDecoration: 'none', color: 'white' }} to="/article" >New Article</Link></li>

         <li><Link style={{ textDecoration: 'none', color: 'white', position: 'right' }} to="/journalists" >Journalist</Link></li>

         <li><Link style={{ textDecoration: 'none', color: 'white', position: 'right' }} to="/journalists/new" >Add New Journalist</Link></li>
          </ul>
        ):
        (
          null
        )
        }

       </div>

    );
  }
}

export default NavBar;


// style = {{background:"darkred",width:"200px"}}

//
// import React from "react";
// import {Link} from "react-router-dom";
//
// const NavBar = () => (
//
//
//   <ul>
//     <li>
//       <Link to="/" >Home</Link>
//     </li>
//     <li>
//       <Link to="/article" >New Article</Link>
//     </li>
//     <li>
//       <Link to="/journalist" >New Journalist</Link>
//     </li>
//   </ul>
//
// )
//
//
// export default NavBar;

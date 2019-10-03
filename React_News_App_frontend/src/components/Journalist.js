import React from 'react';
import {Link} from 'react-router-dom';
const Journalist = (props) => {
 const url = "http://localhost:8080/journalists" + props.journalist.id;
 return (
   <React.Fragment>
   <Link to = {url} className="name">
   {props.journalist.firstName + " "}
   {props.journalist.lastName}
   </Link>
   </React.Fragment>
 )
}
export default Journalist;

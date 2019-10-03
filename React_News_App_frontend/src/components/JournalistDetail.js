import React from 'react';
import Journalist from './Journalist.js';
const JournalistDetail = (props) => {
 return (
   <div className = "component">
     <Journalist journalist = {props.journalist}/>
   </div>
 )
}
export default JournalistDetail;

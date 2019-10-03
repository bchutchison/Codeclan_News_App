import React from 'react';
import Journalist from './Journalist.js';
const JournalistList = (props) => {
 const journalists = props.journalists.map((journalist, index) => {
   return (
     <li key={index} className="component-item">
     <div className="component">
     <Journalist journalist={journalist} />
     </div>
     </li>
   )
 })
return (
 <div className="form">
  <ul className="component-list">
    {journalists}
  </ul>
 </div>
)
}
export default JournalistList;

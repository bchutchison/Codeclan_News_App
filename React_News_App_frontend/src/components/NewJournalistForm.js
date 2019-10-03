import React, { Component } from 'react';

const NewJournalistForm = (props) => {
   function handleSubmit(event) {
     event.preventDefault();
     const journalist = {
       "firstName": event.target.firstName.value,
       "lastName": event.target.lastName.value
     }
     props.handleJournalistPost(journalist);
     console.log(journalist)
   }
   return (
     <div className="form">
     <form onSubmit={handleSubmit}>
      <div>
        <label >First Name: </label>
         <div>
         <input type="text"  name="firstName"/>
         </div>
        </div>

        <div>
         <label >Last Name: </label>
         <div>
         <input type="text"  name="lastName"/>
         </div>
        </div>

         <button className="submitJournalist" type="submit">Save</button>
     </form>
     </div>
   )
 }
export default NewJournalistForm;

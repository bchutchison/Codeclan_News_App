import React, { Component } from 'react';
import Request from '../../helpers/request.js';
import NewJournalistForm from '../../components/NewJournalistForm';
class JournalistFormContainer extends Component {
 constructor(props){
   super(props);
   this.handleJournalistPost = this.handleJournalistPost.bind(this);
 }
  handleJournalistPost(journalist){
   const request = new Request();
   request.post('http://localhost:8080/journalists', journalist).then(() => {
     window.location = 'http://localhost:3000/journalists'
   })
 }
 render() {
   return <NewJournalistForm handleJournalistPost = {this.handleJournalistPost} />
 }
}
export default JournalistFormContainer;

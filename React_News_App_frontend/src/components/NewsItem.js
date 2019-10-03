import React from 'react';
import './css/NewsItem.css';
import Collapsible from 'react-collapsible';
const NewsItem = (props) => {

  const handleClick = () => {
    let updatedRating = props.article.rating + 1;
    props.updateRating(props.article.id, updatedRating)
  }

  const handleClickJournalist = () => {
    props.filterArrayByJournalist(props.article.journalist.firstName, props.article.journalist.lastName);
  }



 return (
   <div className='story-list'>
     <hr />
     <div className='story-list-objects'>
       <img src={props.article.picUrl} alt={props.article.picUrl} />
       <div className='story-list-info'>
         <h4>{props.article.title}</h4>
         <p>Author: {props.article.journalist.firstName} {props.article.journalist.lastName} </p>
         <h6>{props.article.summary}</h6>
       </div>
      </div>
      <br/>
     <button onClick={handleClick}><Collapsible trigger="| Full story |" ><p>{props.article.content}</p>
     <div className='journalist-tag'>
       <a onClick={handleClickJournalist}>
       See more stories by {props.article.journalist.firstName} {props.article.journalist.lastName}...</a>
     </div>
     </Collapsible></button>
   </div>
 )
}
export default NewsItem;

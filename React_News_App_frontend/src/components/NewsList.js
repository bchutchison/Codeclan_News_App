import React from 'react';
import NewsItem from './NewsItem.js';

const NewsList = (props) => {

  //sorts articles
    const allArticlesSorted = props.articles.sort(function(a, b) {
      return b.rating - a.rating
    });

  //sorts filteredArticles
    const categoryArticlesSorted = props.filteredArticles.sort(function(a, b) {
      return b.rating - a.rating
    });

const articleNodes = () => {
  let filteredNodes;
  if(!props.category) {
    filteredNodes = (allArticlesSorted.slice(1)).map( (article, index) => {
      return (
        <NewsItem key={index} article={article} updateRating={props.updateRating} filterArrayByJournalist={props.filterArrayByJournalist}></NewsItem>
      )
    })
  }
  else
  {
    filteredNodes = (categoryArticlesSorted.slice(1)).map( (article, index) => {
      return (
        <NewsItem key={index} article={article} updateRating={props.updateRating} filterArrayByJournalist={props.filterArrayByJournalist}></NewsItem>
      )
    })
  }
  return filteredNodes
}

return(
    <>
      {articleNodes()}
    </>
  )
}

export default NewsList;

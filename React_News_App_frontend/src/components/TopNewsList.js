import React from 'react';
import TopNewsItem from './TopNewsItem.js';

const TopNewsList = (props) => {


//sorts articles
  const allArticlesSorted = props.articles.sort(function(a, b) {
    return b.rating - a.rating
  })[0];

//sorts filteredArticles
  const categoryArticlesSorted = props.filteredArticles.sort(function(a, b) {
    return b.rating - a.rating
  })[0];


  const selectArray = () => {
    let arrayAll = allArticlesSorted
    let arrayCategory = categoryArticlesSorted
    if(!categoryArticlesSorted) {
    return (
        <TopNewsItem topArticle={arrayAll} filterArrayByJournalist={props.filterArrayByJournalist}></TopNewsItem>
    )
  } else {
    return (
        <TopNewsItem topArticle={arrayCategory} filterArrayByJournalist={props.filterArrayByJournalist}></TopNewsItem>
    )
   }
  }

  if (!allArticlesSorted) {
    return null;
  } else {
      return(
      <>
      {selectArray()}
    </>
    )
  }
}

export default TopNewsList;

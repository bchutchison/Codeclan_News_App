import React, {Component} from 'react';
import Header from '../components/Header.js';
import NavBar from '../components/NavBar.js';
import Home from '../components/Home.js';
import NewArticleForm from '../components/NewArticleForm.js';
import NewJournalistForm from '../components/NewJournalistForm.js';
import JournalistFormContainer from './journalists/JournalistFormContainer.js';
import JournalistList from '../components/JournalistList';
import Request from '../helpers/request.js';

import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

class NewsContainer extends Component {

  constructor(props) {
    super(props);

    this.state = {
      articles: [],
      journalistArray: [],
      filteredArticles: [],
      currentArticle: null,
      category: null,
    };
    this.filterArray = this.filterArray.bind(this);
    this.filterArrayAll = this.filterArrayAll.bind(this);
    this.updateRating = this.updateRating.bind(this);
    this.updateRatingLocal = this.updateRatingLocal.bind(this);
    this.filterArrayByJournalist = this.filterArrayByJournalist.bind(this);
    this.handleArticlePost = this.handleArticlePost.bind(this);
  };

  componentDidMount() {
   const url = "http://localhost:8080/articles";
   fetch(url)
   .then(res => res.json())
   .then(articles => this.setState({articles: articles._embedded.articles}))
   .catch(err => console.error);

   fetch("http://localhost:8080/journalists")
   .then(res => res.json())
   .then(data =>
     this.setState({
       journalistArray: data._embedded.journalists
     })
   )
     .catch(err => console.error);
 }

  filterArray(selectedCategory) {
      this.setState({category: selectedCategory})
      const articlesByCategory = []
       this.state.articles.filter(function(articleObject) {
        articleObject.categories.forEach(function(category) {
          if(category.name.includes(selectedCategory)) {
            articlesByCategory.push(articleObject);
          }
        })
      })
      this.setState({filteredArticles: articlesByCategory})
  }

  filterArrayAll() {
    const articlesByCategory = this.state.articles
    this.setState({filteredArticles: articlesByCategory})
  }

//filters articles by journalist
  filterArrayByJournalist(journalistFirst, journalistLast) {
    const articlesByJournalist = []
    this.state.articles.filter(function(articleObject) {
      if(articleObject.journalist.firstName.includes(journalistFirst) & articleObject.journalist.lastName.includes(journalistLast))  {
        articlesByJournalist.push(articleObject);
      }
    })
    this.setState({filteredArticles: articlesByJournalist})
  }


//update rating for article popularity
  updateRatingLocal(id, newRating){
    let articlesToModify = [...this.state.articles]
    let index = articlesToModify.findIndex(article => article.id === id)
    articlesToModify[index].rating = newRating;
    this.setState(articlesToModify)
  }

  updateRating(id, newRating){
    const url = `http://localhost:8080/articles/${id}`
    let updatedRating = { rating: newRating}
    fetch(url, {
      method: "PATCH",
      body: JSON.stringify(updatedRating),
      headers: {
        'Content-Type': 'application/json'
      }
    })
    .then(res => res.json())
    .catch(err => console.error);
    this.updateRatingLocal(id, newRating);
  }

  handleArticlePost(article){
   const request = new Request();
   request.post('http://localhost:8080/articles', article).then(() => {
     window.location = 'http://localhost:3000'
   })
 }




  render() {
     return(
       <>
         <Header />
         <Router>
          <React.Fragment>
            <NavBar />
              <Switch>

                <Route
                exact path="/"
                render={() => <Home filterArray={this.filterArray} filterArrayAll={this.filterArrayAll} articles={this.state.articles} filteredArticles={this.state.filteredArticles} category={this.state.category}
                updateRating={this.updateRating} filterArrayByJournalist={this.filterArrayByJournalist}/>}
                />


                <Route
                path="/article"
                render={() => <NewArticleForm handleArticlePost={this.handleArticlePost} />}
                />

                <Route exact path="/journalists" render={(props) => {
                   return <JournalistList journalists={this.state.journalistArray}/>
                 }} />

                <Route exact path = '/journalists/new'
                  render={(props) =>{
                    return <JournalistFormContainer journalists = {this.state.journalists}/>
                 }}/>

              </Switch>
          </React.Fragment>
         </Router>
       </>
     )
  }

}

export default NewsContainer;



// <Route path="/journalist" component={NewJournalistForm} />


// <Route
// path="/article"
// render={() => <NewArticleForm jounalistId={this.state.articles.journalist.id}}
// />

import React, {Component} from 'react';
import NewsList from './NewsList.js'
import NavBar from './NavBar.js';
import Home from './Home.js';
import NewArticleForm from './NewArticleForm.js';
import NewJournalistForm from './NewJournalistForm.js';

import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

class Main extends Component {
  constructor() {
    super();
  }

  render() {
    return (
      <Router>
       <React.Fragment>
         <NavBar />
           <Switch>
             <Route exact path="/" component={Home} />
             <Route path="/article" component={NewArticleForm} />
             <Route path="/journalist" component={NewJournalistForm} />
           </Switch>
       </React.Fragment>
      </Router>
    )
  }
}

export default Main;

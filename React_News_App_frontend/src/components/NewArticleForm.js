import React, { Component } from 'react';
import './css/ArticleForm.css';

// import { Button, Form, FormGroup, Label, Input, FormText } from 'reactstrap';
import DatePicker from "react-datepicker";
import Request from "../helpers/request";
import axios from 'axios';

import "react-datepicker/dist/react-datepicker.css";

class NewArticleForm extends Component {
  constructor(props) {
    super(props);

    this.state = {
      title: '',
      journalist: '',
      journalistArray: [],
      date: new Date,
      summary: '',
      picUrl: '',
      content: '',
      category: {
        'Politics': false,
        'Education': false,
        'Health': false,
        'Tech': false,
        'Science': false,
        'Crime': false
      }
    };

    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleTitleChange = this.handleTitleChange.bind(this);
    this.handleJournalistChange = this.handleJournalistChange.bind(this);
    this.handleDateChange = this.handleDateChange.bind(this);
    this.handleSummaryChange = this.handleSummaryChange.bind(this);
    this.handleImageChange = this.handleImageChange.bind(this);
    this.handleContentChange = this.handleContentChange.bind(this);
    this.handleCategoryChange = this.handleCategoryChange.bind(this);
  }

  componentDidMount() {
    this.fetchJournalists();
  }

  fetchJournalists() {
  fetch(`http://localhost:8080/journalists`)
    .then(res => res.json())
    .then(data =>
      this.setState({
        journalistArray: data._embedded.journalists
      })
    )
    .catch(err => console.error);
  }

  handleTitleChange(event) {
    this.setState({ title: event.target.value });
  }
  handleJournalistChange(event) {
    this.setState({ journalist: event.target.value });
  }
  handleDateChange(event) {
    this.setState({ date: event.target.value });
  }
  handleDateChange = newDate => {
    this.setState({date: newDate  });
  };
  handleSummaryChange(event) {
    this.setState({ summary: event.target.value });
  }
  handleImageChange(event) {
    this.setState({ picUrl: event.target.value });
  }
  handleContentChange(event) {
    this.setState({ content: event.target.value });
  }
  handleCategoryChange(event) {
  const value = event.target.value;
  this.setState(prevState => ({
      category: {
        ...prevState.category,
        // [value]: "true"
        [value]: !prevState.category[value]
      }
    }));
    };

  handleSubmit(event) {
    if (!this.canBeSubmitted()) {
      event.preventDefault();
      return;
    }
    const newArticle = {
      title: this.state.title,
      journalist: `http://localhost:8080/journalists/${this.state.journalist}`,
      date: this.state.date,
      summary: this.state.summary,
      picUrl: this.state.picUrl,
      content: this.state.content,
      category: this.state.category
    };
    console.log(newArticle)
    alert(`Thank you for submitting`);
    this.handleArticlePost(newArticle);
  }

  handleArticlePost(article){
   const request = new Request();
   request.post('http://localhost:8080/articles', article).then(() => {
     window.location = 'http://localhost:3000/'
   })
 }

  canBeSubmitted() {
    const { title, journalist, summary, picUrl, content} = this.state;
    return title.length > 0 && journalist.length > 0 && summary.length > 20 && picUrl.length > 0 && content.length > 50;
  }

  render() {
    const categories = ['Politics', 'Education', 'Health', 'Tech', 'Science', 'Crime'];

    const isEnabled = this.canBeSubmitted();


    return (

      <div className="form">
      <form onSubmit={this.handleSubmit}>

      <div>
        <label htmlFor="title">Title: </label>
        <div>
        <input
          id="title"
          type="text"
          value={this.state.title}
          onChange={this.handleTitleChange}
        />
        </div>
      </div>

      <div>
        <label htmlFor="journalist">Author: </label>
        <div>
        <select onChange={this.handleJournalistChange}>
          {this.state.journalistArray.map((item) =>
            <option value={item.id}>{item.firstName} {item.lastName}
            </option>
          )}
        </select>
        </div>
      </div>

      <div>
      <label htmlFor="date">Date: </label>
      <div>
        <DatePicker
          selected={this.state.date}
          onChange={this.handleDateChange}
          showTimeSelect
          dateFormat="Pp"
        />
        </div>
      </div>

      <div>
        <label htmlFor="summary">Summary: </label>
        <div>
        <textarea
          className="summaryField"
          id="summary"
          type="text"
          value={this.state.summary}
          onChange={this.handleSummaryChange}
        />
        </div>
      </div>

      <div>
        <label htmlFor="exampleImage">Image: </label>
        <div>
        <input
        type="url"
        name="image"
        id="exampleImage" onChange={this.handleImageChange}/>
        </div>
      </div>

      <div tag="fieldset">
        <label htmlFor="category">Category: </label>
          <div>
            {categories.map((category, index) =>
                <label key={index} >
                  <input
                  value={category}
                  name={category}
                  checked={this.state.category[category]}
                  onChange={this.handleCategoryChange}
                  type="checkbox"
                  />
                  {category}
                </label>
              )}
          </div>
      </div>

      <div>
        <label htmlFor="content">Story: </label>
        <div>
        <textarea
          className="contentField"
          id="content"
          type="text"
          value={this.state.content}
          onChange={this.handleContentChange}
        />
        </div>
      </div>

      <div>
      <button className="submitArticle" disabled={!isEnabled} type="submit" >
        Submit
      </button>
      </div>

      </form>
      </div>

    )
  }

}

export default NewArticleForm;


// <div>
//   <select onChange={this.handleJournalistChange}>
//     {journalists.map((item) =>
//       <option value={item.firstName}>{item.firstName}
//       </option>
//     )}
//   </select>
// </div>


// const { journalists } = this.state;
// console.log(journalists)



// journalists.map(journalist => {
//       const { firstName, lastName } = journalist;
//       return (
//         <div>
//           <p>First Name: {firstName}</p>
//           <p>LastName: {lastName}</p>
//         </div>
//       );
//     })

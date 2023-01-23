import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
//import App1 from './12jan/App1';
import reportWebVitals from './reportWebVitals';
import App2 from './13Jan/App2';
import { BrowserRouter } from 'react-router-dom';
import App14 from './14-Jan/App14';
import AppRouteEx from './14-Jan/AppRouteEx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    //<App2></App2>
     <BrowserRouter><AppRouteEx /></BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

import logo from "./logo.svg";
import "./App.css";

import React, { Component } from "react";
import SassComponent from "./SassComponent";
import CSSModule from "./CSSModule";
import StyledComponent from "./StyledComponent";

class App extends Component {
	render() {
		return (
			<div>
				<StyledComponent></StyledComponent>
			</div>
		);
	}
}

export default App;

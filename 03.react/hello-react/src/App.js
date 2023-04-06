import "./App.css";
import { Component } from "react";
import MyComponent from "./MyComponent";
import Counter from "./Counter";
import Say from "./Say";
import EventPractice from "./EventPractice";
import ValidationSample from "./ValidationSample";
import ScrollBox from "./ScrollBox";
import { IterationSample } from "./IterationSample";

class App extends Component {
	render() {
		return (
			<>
				<ScrollBox
					ref={(ref) => {
						this.ScrollBox = ref;
					}}
				/>
				<button
					onClick={() => {
						this.ScrollBox.scrollToBottom();
					}}
				>
					맨밑으로
				</button>
				<IterationSample></IterationSample>
			</>
		);
	}
}

export default App;

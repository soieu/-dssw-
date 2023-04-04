"use strict";

const e = React.createElement;

// 클래스형 from 사이트
class LikeButton extends React.Component {
	constructor(props) {
		super(props);
		this.state = { liked: false };
	}

	render() {
		if (this.state.liked) {
			return "You liked this.";
		}

		return e(
			"button",
			{ onClick: () => this.setState({ liked: true }) },
			"Like"
		);
	}
}

// 함수형
function LikeButton() {
	const [isClicked, setIsClicked] = React.useState(false);
	return React.createElement(
		"button",
		{ onClick: () => setIsClicked(true) },
		isClicked ? "좋아요" : "싫어요"
	);
}
const domContainer = document.querySelector("#like_button_container");
const root = ReactDOM.createRoot(domContainer);
root.render(e(LikeButton));

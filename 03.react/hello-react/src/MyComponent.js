import React, { Component } from "react";
import PropTypes from "prop-types";

class MyComponent extends Component {
	static defaultProps = {
		name: "기본 이름",
	};
	static propTypes = {
		name: PropTypes.string,
		favoriteNumber: PropTypes.number.isRequired,
	};
	render() {
		const { name, children, favoriteNumber } = this.props;
		return (
			<div>
				안녕 내이름은 {name}
				<br /> children값은 {children} 입니다.
				<br />
				조와하는 숫자는 {favoriteNumber}얌
			</div>
		);
	}
}
// const MyComponent = (props) => {
// 	const { name, children, favoriteNumber } = props;
// 	return (
// 		<div>
// 			안녕 내이름은 {name}
// 			<br /> children값은 {children} 입니다.
// 			<br />
// 			조와하는 숫자는 {favoriteNumber}얌
// 		</div>
// 	);
// };

// MyComponent.defaultProps = {
// 	name: "기본 이름",
// };
// MyComponent.propTypes = {
// 	name: PropTypes.string,
// 	favoriteNumber: PropTypes.number.isRequired,
// };
export default MyComponent;

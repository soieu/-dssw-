import React, { useReducer } from "react";

function reducer(state, action) {
	return {
		...state,
		[action.name]: action.value,
	};
}

export const Newinfo = () => {
	const [state, dispatch] = useReducer(reducer, {
		name: "",
		nickname: "",
	});
	const { name, nickname } = state;
	const onChange = (e) => {
		dispatch(e.target);
	};
	return (
		<>
			<div>
				<input value={name} onChange={onChange}></input>
				<input value={nickname} onChange={onChange}></input>
			</div>
			<div>
				<div>
					<b>이름:</b> {name}
				</div>
				<div>
					<b>닉네임: </b> {nickname}
				</div>
			</div>
		</>
	);
};

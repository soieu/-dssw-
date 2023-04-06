import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";
import { Counter } from "./Counter";
import { Info } from "./Info";
import { Newcounter } from "./Newcounter";
import { Newinfo } from "./Newinfo";
import { Average } from "./Average";

function App() {
	const [visible, setVisible] = useState(false);

	return (
		<>
			<Average></Average>
		</>
	);
}

export default App;

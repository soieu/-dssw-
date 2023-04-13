import logo from "./logo.svg";
import "./App.css";
import axios from "axios";

function App() {
	const getData = async () => {
		const res = await axios.get(
			"https://openapi.naver.com/v1/search/shop.json",
			{
				params: {
					query: "슬램덩크",
				},
				headers: {
					"X-naver-client-Id": "BxrBS6WttbrBWu10X41S",
					"X-naver-Client-Secret": "7p8edFJ99e",
				},
			}
		);
		console.log(res);
	};
	getData();
	return <></>;
}

export default App;

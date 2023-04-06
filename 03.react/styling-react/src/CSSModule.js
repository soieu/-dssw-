import styles from "./CSSModule.module.css";
const CSSModule = () => {
	return (
		<div className={`${styles.wrapper} ${styles.inverted}`}>
			안안녕하하세세요요 저는{" "}
			<span className='something'>CSS Module!</span>
		</div>
	);
};

export default CSSModule;

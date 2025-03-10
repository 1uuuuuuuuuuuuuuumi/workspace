import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import { BrowserRouter } from "react-router-dom";

createRoot(document.getElementById("root")).render(
  // 라우터 사용하려면 맨처음에 브라우저라우터로 App을 감싸줘야함 !
  <BrowserRouter> 
    <App />
  </BrowserRouter>
);

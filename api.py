from typing import Union
from fastapi import FastAPI


app = FastAPI()

@app.get("/")
def read_root():
    return {"Hello": "World"}

@app.get("/greeting")
def get_name(name:str):
    name=name
    return name
    
    

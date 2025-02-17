import os
import PyPDF2

from openai import OpenAI
from dotenv import load_dotenv, find_dotenv

_ = load_dotenv(find_dotenv())
client = OpenAI (
    api_key=os.environ.get('OPENAI_API_KEY'),
)

model = "gpt-4-turbo-preview"
temperature = 0.7
max_tokens = 500
topic = ""

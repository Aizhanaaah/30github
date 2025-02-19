from transformers import AutoTokenizer

sentence = "Hello Aizhan"
tokenizer = AutoTokenizer.from_pretrained(
    "bert-base-cased"
)
colors = [
    '102;194;165', '252;141;98', '141;160;203',
    '231;138;195', '166;216;84', '255;217;47'
]

token_ids = tokenizer(sentence).input_ids
print(token_ids)

for token_id in token_ids:
    print(tokenizer.decode(token_id))

for idx, t in enumerate(token_ids):
    print(
        f'\x1b[0;30;48;2' + 
        f'{colors[idx % len(colors)]}m' +
        tokenizer.decode(t) + 
        'x1b[0m]',
        end = ' '
    )

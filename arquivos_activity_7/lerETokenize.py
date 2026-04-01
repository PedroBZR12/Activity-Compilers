import re

def tokenize(texto):
    token_spec = [
        ('WORD', r'[A-Za-zÀ-ÖØ-öø-ÿ]+'),
        ('NUM',  r'\d+'),
        ('PONT', r'[.,;:!?]'),
        ('SPACE', r'\s+'),
    ]
    regexp = '|'.join(f'(?P<{name}>{pattern})' for name, pattern in token_spec)
    tokens = []
    for match in re.finditer(regexp, texto):
        tipo = match.lastgroup
        lexema = match.group()
        if tipo != 'SPACE':
            tokens.append(lexema)
    return tokens

# Lendo o arquivo
with open("livro.txt", "r", encoding="utf-8") as f:
    texto = f.read()

tokens = tokenize(texto)
print(tokens[:500])  # mostra só os primeiros 500 tokens

# Activity-Compilers

## Activity 1
scanner_simples.sh
```sh
echo "========================================"
echo "  SCANNER SIMPLES - Fluxo de Entrada"
echo "========================================"
echo ""

numero_linha=0

while IFS= read -r linha; do

    numero_linha=$((numero_linha + 1))

    # Etapa 3: Pre-processamento - remove espacos, tabs e \r
    # Equivalente ao que o scanner faz antes de tokenizar
    linha_limpa=$(echo "$linha" | tr -d ' \t\r')

    echo "[SCANNER] Linha $numero_linha recebida : '$linha_limpa'"

    # Aqui viria o processamento lexico (analise de tokens)
    # Pode ser expandido com AI/LLM futuramente

done

echo "========================================"
echo "  Fim do stream de caracteres."
echo "  Total de linhas lidas: $numero_linha"
echo "========================================"
```
![print ao rodar scanner simples part 1](prints/atv_1_print_1.png)
![print ao rodar scanner simples part 2](prints/atv_1_print_2.png)
![print ao rodar scanner simples part 3](prints/atv_1_print_3.png)

## Activity 2
utilizando regex para analisar a seguinte linha:
`position = initial + rate * 60`
para capturar todos os tokens:
```re
/([a-zA-Z_][a-zA-Z0-9_]*)|(\d+)|([=+\-*])|(\s+)/gm
```
![print do regex funcionando](prints/atv_2_print.png)

A regex foi usada para identificar identificadores, números e operadores no código. Cada token corresponde a um padrão definido por expressões regulares. Isso demonstra como o scanner de compiladores reconhece lexemas no fluxo de caracteres.


## Activity 3
no Editor do VsCode, não é possível juntar as duas análises léxicas.
removendo comentários de código:
![print do regex funcionando](prints/atv_3_print_1.png)
![print do regex funcionando](prints/atv_3_print_2.png)
trocando = por := em códigos:
![print do regex funcionando](prints/atv_3_print_3.png)

Remover espaços extras
![print do regex funcionando](prints/atv_3_print_4.png)

converter CSV para TSV podemos substituir as `,` por `\t`
![print do regex funcionando](prints/atv_3_print_5.png)

CSV de portugûes para inglês trocando `,` para `.` o mesmo pode ser feito com `,` para `;`
![print do regex funcionando](prints/atv_3_print_6.png)

## Activity 4
Função que tokeniza texto e retorna lista de tuplas
Python:
![print do código python](prints/atv_4_print_1.png)

Java:
![print do código python](prints/atv_4_print_2.png)


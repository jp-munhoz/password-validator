# Password Validator

Projeto realizado para a vaga de Engenheiro de Sofware para o Itau.
O password validator é responsável por verificar se a senha segue os
seguintes parâmetros de aceite:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
- Não possuir caracteres repetidos dentro do conjunto

Para essa solução foi usada a biblioteca chamada Passay que fornece quase todos os parâmetros
que foram sugeridos para a senha, de forma bem explicativa podendo ser escalável com base na adição
de novos parâmetros. Porém, a última verificação de caracteres repetidos teve que ser
feita utilizando o Regex, pois a biblioteca não fornece uma função que verifica essa
regra, mas ela fornece um IllegalRegexRule que me possibilita construir um regex para ser
validado com os demais.

### Linguagens e Frameworks utilizados

Para o desenvolvimento foi utilizada a Linguagem Java (versão 18) e o framework Spring boot.

### Como testar?

Após baixar o projeto, para rodar a aplicação você terá que entrar na pasta /target
localizada na raiz do projeto, abrir ela no CMD e fará o seguinte comando:

`java -jar senha-0.0.1-SNAPSHOT`

Quando a aplicação estiver em funcionamento, você pode utilizar qualquer ferramenta de
desenvolvimento de API para fazer requisições.

- Validar senha
  - Metodo: Post
  - url: `localhost:8080/password/isValid`
  - Body: Raw/Text

### Referências utilizadas
- https://www.passay.org/
- https://regex101.com/
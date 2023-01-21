# Estudo de Caso : ConcurrentModificationException durante a execução de MultiThreads

## Descrição do problema

Para a execução desse projeto, será necessário utilizar a versão do 11 do Java. 

Para reproduzir o erro, elaborei 3 classes
- Uma classe que realiza operações em lista, que chamaremos de ClasseC (por ser a camada mais interna em execução)
- Uma classe intermediária que percorre a lista retornada pelo método validar() da ClasseC que vou chamar de ClasseB
- E por fim a classe que executa as Threads, nomeada ClasseA.

O problema apresenta algumas peculiaridades:
- O erro é intermitente. A execução do projeto uma única vez pode fazer a falha passar desapercebida dificultando a captura do log em ambientes produtivos. Isso ocorre pois os processos (por pura sorte) acabam não acessando o mesmo recurso ao mesmo tempo.
- O número de Threads aumenta as chances de ocorrência da falha
- O tamanho da lista também aumenta a probabilidade de ocorrência do erro.

## Possiveis soluções

Até o presente momento, encontrei duas possíveis soluções para o problema, cada uma delas apresenta vantagens e desvantagens. A primeira solução consiste em instanciar uma ArrayList em cada execução do método validar() da ClasseC, no entanto isso acarreta no problema de precisar instanciar uma Array list a cada vez que realiza uma execução do método.

A segunda abordagem consiste em usar a CopyOnWriteArrayList, que nada mais é que uma implementação de ArrayList Thread-safe pelo Java. A desvantagem dessa abordagem está no tempo de execução, tendo em vista que ela trabalha de modo a evitar conflitos entre manipulação de objetos pelas threads, prejudicando assim o tempo de execução. 

Ainda assim, ambos os métodos podem apresentar problemas na manipulação de dados dependendo do tamanho da lista, sendo o primeiro mais resiliente.

Nesse projeto, desenvolvi uma branch para cada uma das abordagens, a fim de que a execução de testes seja facilitada, os nomes das branchs são os seguintes:
- feature/instancearrays
- feature/threadsafe

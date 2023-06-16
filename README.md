<h1> <strong> Teste para Desenvolvedor </strong> </h1>
Você deve criar um sistema de análise de dados, onde o sistema deve importar lotes de arquivos, ler e analisar os dados e produzir um relatório. 
Existem 3 tipos de dados dentro desses arquivos. <br>
Para cada tipo de dados há um layout diferente. 

<h3> <strong> Dados do vendedor </strong> </h3>
Os dados do vendedor têm o formato id <strong> 001 </strong> e a linha terá o seguinte formato.
<br>  &nbsp; &nbsp; <strong> 001çCPFçNameçSalary </strong> <br>

<h3> <strong> Dados do cliente </strong> </h3>
Os dados do cliente têm o formato id <strong> 002 </strong> e a linha terá o seguinte formato.
<br>  &nbsp; &nbsp; <strong>  002çCNPJçNameçBusiness Area  </strong> <br>

<h3> <strong> Dados de vendas  </strong> </h3>
Os dados de vendas têm o formato id <strong> 003 </strong> . <br>Dentro da linha de vendas, existe a lista de itens, que é envolto por colchetes [].<br> A linha terá o seguinte formato. 
<br>  &nbsp; &nbsp; <strong> 003çSale IDç[Item ID-Item Quantity-Item Price]çSalesman name  </strong> <br> 

<h3> <strong> Dados de Exemplo </strong> </h3>
O seguinte é um exemplo dos dados que o sistema deve ser capaz de ler. <br>
001ç1234567891234çPedroç50000 <br>
001ç3245678865434çPauloç40000.99 <br>
002ç2345675434544345çJose da SilvaçRural <br>
002ç2345675433444345çEduardo PereiraçRural <br>
003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro <br>
003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo <br>

<h3> <strong> Análise de dados  </strong> </h3>
Seu sistema deve ler dados do diretório padrão, localizado em% HOMEPATH% / data / in.  <br> 
O sistema deve ler somente arquivos .dat.  <br> 
Depois de processar todos os arquivos dentro do diretório padrão de entrada, o sistema deve criar um arquivo dentro do diretório de saída padrão, localizado em% HOMEPATH% /data/out.  <br> 
O nome do arquivo deve seguir o padrão, {flat_file_name} .done.dat.  <br> 
O conteúdo do arquivo de saída deve resumir os seguintes dados:  <br>
● Quantidade de clientes no arquivo de entrada  <br> 
● Quantidade de vendedor no arquivo de entrada  <br>  
● ID da venda mais cara  <br>  
● O pior vendedor  <br> 

O sistema deve estar funcionando o tempo todo.  <br> 
Todos os arquivos novos estar disponível, tudo deve ser executado  <br> 
Seu código deve ser escrito em Java.  <br>  
Você tem total liberdade para utilizar google com o que você precisa. Sinta-se à vontade para escolher qualquer biblioteca externa se for necessário.   <br> 
Critérios de Avaliação  <br> 
● Clean Code  <br> 
● Simplicity  <br> 
● Logic  <br> 
● SOC (Separation of Concerns)  <br> 
● Flexibility/Extensibility  <br> 
● Scalability/Performance  <br> 
OBS de Envio:  <br> 
Enviar o projeto com a solução em anexo por email ou link para o github. <br> 

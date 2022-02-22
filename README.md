# Sistema de gerenciamento de venda e estoque de produtos utilizando JPA e Hibernate
## Curso: Spring Boot com Ionic - Estudo de Caso Completo - Prof. Dr. Nelio Alves
### Implementação de modelo conceitual
###  Objetivo geral: 
O estudo de caso deste capítulo tem como objetivo mostrar na prática como um modelo conceitual (modelo de
domínio em nível de análise) pode ser implementado sobre o paradigma orientado a objetos, usando padrões de
mercado e boas práticas.

Vamos tomar como caso um modelo conceitual abrangente, com o qual possamos mostrar a implementação prática
em linguagem orientada a objetos dos seguintes tópicos:
+ Leitura e entendimento do diagrama de classes
+ Leitura e entendimento do diagrama de objetos
+ Associações
    + Um para muitos / muitos para um
    + Um para um
    + Muitos para muitos comum
    + Muitos para muitos com classe de associação
    + Bidirecionais / direcionadas
+ Conceito independente / dependente
+ Classe de associação
+ Herança
+ Enumerações
+ Atributos Embedded (ItemPedidoPK)
+ Coleções ElementCollection (telefones de um cliente)
### A estrutura de camadas do sistema foi implementa conforme a seguir:
![Estrutura de camadas da API](https://user-images.githubusercontent.com/77124683/155135270-bb61ca61-725c-4cbd-a384-289783c7a0ac.png)
### Objetivos específicos:
1. Fazer uma implementação padrão do seguinte modelo conceitual:
![diagrama-de-classes](https://user-images.githubusercontent.com/77124683/155135429-ee8f6be1-f82f-4150-ab44-25481d9e417b.png)
2. Criar a seguinte instância do modelo conceitual:
![diagrama-de-objetos](https://user-images.githubusercontent.com/77124683/155135774-86b2dc11-e8d0-4b11-a854-ef400e4f72bd.png)
3. Gerar uma base de dados relacional automaticamente a partir do modelo conceitual, bem como povoar a base com a instância dada.
    * Banco H2:
    ![Banco h2](https://user-images.githubusercontent.com/77124683/155136817-e5cb7a9e-6b96-4564-9bc4-bd8bd8f62c31.PNG)
4. Recuperar os dados e disponibilizá-los por meio de uma API Rest BÁSICA. Os seguintes end points devem ser disponibilizados: 
<table>
  <tr>
    <th>End Point</th>
    <th>Dados</th>
  </tr>
  <tr>
    <td>/categorias/{id}</td>
    <td>Categoria e seus produtos</td>
  </tr>
  <tr>
    <td>/clientes/{id}</td>
    <td>Cliente, seus telefones e seus endereços</td>
  </tr> <tr>
    <td>/pedidos/{id}</td>
    <td>Pedido, seu cliente, seu pagamento, seus itens de pedido, 
    seu endereço de entrega</td>
  </tr>
</table>

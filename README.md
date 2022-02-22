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
imagem
### Objetivos específicos:
imagem
1. Fazer uma implementação padrão do seguinte modelo conceitual:
imagem
2. Criar a seguinte instância do modelo conceitual:
imagem
3. Gerar uma base de dados relacional automaticamente a partir do modelo conceitual, bem como povoar a base com a instância dada.

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

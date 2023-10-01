Code implements online shop.

Product is a data class with product information.

Shop is a class with holds a Hashmap with products and their quantity in stock. Has methods do add products to stock,
reserve products, unreserve products and ship to clients. Shop class implements Recipient in order to receive payments
from clients.

Client class holds client information and has methods to add product from shop to order and finalize order. Client class
contains a list of past orders. Client class
implements Payer in order to pay for products.

Order class is holds a list of products and the client which ordered. Also applies a LocalDateTime to the order when
it's
finalized. Enum order status tracks the stages of the order. If an order gets canceled, order calls the unreserve method
in Shop.

Payment class takes a Payer, a Recipient and an amount in order to make the payments. Makes calls to Client and Shop
class methods in order to update their credit amount. Validation is done only in Payer Side. Payment status is updated
using an enum.


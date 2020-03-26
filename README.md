# Requirements

Calculate the net total for items in the shopping cart.

## Base Case

Given that beans cost $2 (represented as 200 cents), buying 3 cans costs $6 or 600 cents.

```java
List<Product> products = new ArrayList<Product>();
Cart cart = new Cart(products);

products.add(new Product("Beans", 3, 200));

int netTotal = cart.CalculateNetTotal();

System.out.printf("Net Total: %d\n", netTotal); // outputs 600
```

## Sales

An item can be on sale. When items are on sale, buying a certain quantity `q` entitles the buyer to another quantity `f` for free.

For example, Beans might be on sale "Buy 3 get 2 free." If this is the case, then pricing per quantity is as follows:

|Quantity| Net Total | Notes |
|--|--|--|
|1|200||
| 2 | 400 ||
|3 | 600| Sale triggered, but additional free items not in cart.|
|4 | 600| Sale triggered, but only 1 free item in cart.|
|5| 600| Sale triggered, all free items in cart.|
|6| 800| Additionall items are full price until the sale is triggered again.|

## Additional Concerns

Our store owner and customer is inventive and is already coming up with new kinds of sales. Our design should allow us to easily extend the problem space to accomodate unknown sale types.

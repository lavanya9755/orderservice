# Problem: 
if we dont run inventoryservice folder , its getting refused , thus its taking help of external api , which wrong and not a good practice if its a paid api then we will be stuck and charged imensely 
# Solution :
we can `MOCK` the method inStock() in OrderService class, instead calling it we will mock it , using Mockito or WireMock

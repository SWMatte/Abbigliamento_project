# Abbigliamento_project
 Build 5 classes to show a list of clothes. Used three methods of class Capo.
 

Delivery Text



R1 - Model Definition
Models are defined through the Model class, whose constructor receives the following parameters: the name of the model, the fixed cost per unit, and the quantity of fabric required to package the model, expressed in square meters.
It should be possible to retrieve the values passed to the constructor using getter methods: getNome() (get name), getCosto() (get cost), getQuantita() (get quantity).

R2 - Material and Color Definition
Materials are represented by the Material class, whose constructor receives the parameters: the name and the cost per square meter. The name and cost can be obtained using the getNome() (get name) and getCosto() (get cost) methods, respectively.
Colors are represented by the Color class, whose constructor receives the parameter: the name. The name can be accessed using the getNome() (get name) method.

R3 - Garment Definition
Garments are defined in terms of models packaged with a certain material. The constructor of the Capo (Garment) class receives the parameters: the model, the material, and the color.
The prezzo() (price) method allows calculating the price of a single garment:

price = fixedCost + materialQuantity * materialCost

A garment can be printed using the toString() method, which returns a string structured as follows:
<model> <color> made of <material>, for example, a pink cotton t-shirt.

R4 - Collection
A collection is a set of garments and is represented by the Collezione (Collection) class.
It is possible to add a garment to a collection using the add() method.
The Collezione (Collection) class defines a series of methods to search for garments within a collection. The trova() (find) method is defined in three variants that take a Model, a Color, or a Material as a parameter. The method returns a collection of garments that use the specified model, color, or material.


show methods on the Main class

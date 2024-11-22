# TA-LABA-Course

# Homework \space  nr \space  2\- \space 3 \space 4\space }
# Theme Zoo
## Zoo Requirement WIP
- Place in Zoo
   - can have Animals inhabitens or can be empty
   - have to schedule cleaning each day
   - should contain feed on time
   - can have special event like feeding some places
   - can allow scheduled visits with the Vet
   - 
- The Vet:
   - can have more than on Animals that it takes care of
   - can prescribe medicine
   - can prescribe health procedures (do research)
 
- Animal Health
   - Should Contain Basic information about single animal like 1 lion or group animals like 1 colony of ants
   - One type of animal or group animal can have more than one prescription
   - contain information about Prescription
   
- Parents (part of Animal Basic Information)
   - Females Name
   - Males Name
   - Females Zoo
   - Males Zoo

- Classification of the animals(part of Basic Information)
   - domain
   - Kingdom.
   - Phylum.
   - Class.
   - Order.
   - Family.
   - Genus.
   - Species.
   
- AnimalBasicInfo
   - can have information about age of animal
   - can contain information about parent 
   - should have the name of the animal
   - If lays eggs
   - Animal Health if it should have information mediciny
   - Clasification of the animal its taxonomy
 
- Birds 
   - Diffrent Beaks serve purpose what they eat
   - Diffrent Feets serve purpose like swimming or catching prey
 
- Mammals   
- Visitors/ Client
   - can by Families with Children or only Adults (enum -> Children under 5, Children between 5 and 16, Adult above 16, Families 2 + 2, Families 2 + 1 )
   - can also by scheduled group
   - 
- Seller
   - can sell various products for the animals like hay or tools or simple things like paper for worker
   - can be one time purchase or multiple purchase or scheduled purchase
   - 
- Workes
   - can schedule a visit for vet
   - can schedule a cleaning
   -  


## Classes

### zoo/animal/subclass
|Nr. | Class  |Description |
| --- | --- | --- |
|1.| Amphibie            |Class that allows to create an object of animal like frogs|
|2.| Bird                |Contains information about animals that are birds like parrots, ducks|
|3.| Fish                |Class that allows to creation an object of animal like goldfish or shark|
|4.| Invertebrates       |Containt Information about an animal that are invertebretes|
|5.| Mammal              |Contains information about an animal that are mammals like mouse, elephant|
|6.| Reptile             |Containt Information about animals that are reptile-like snakes|

### zoo/animal

|Nr. | Class |Description |
| --- | --- | --- |
|1.| AnimalBasicInfor     |Containt Information about animals universal information|
|2.| Classification       |Content of Information about animals belonging to Domain, kingdom, Clyde, class |
|3.| Parents              |Content Information about the parent of the animal if it has any|
|4.| AnimalHealth         |Containt Information about the health of animals if they got some medicine or recent illness |

### zoo/contractor

|Nr. | Class |Description |
| ---  | --- | --- |
|1.| Client           |Contains information about existing places in the zoo like|
|2.| ClientGroup      |Contains Information about|
|3.| Seller           |Contains Information about Veterin that visit the zoo for appointment|
|4.| Vet              |Contains Information about Veterinan who visit the zoo|
|5.| Employee         |Contains Information about that work at the zoo|
|6.| Volunteer        |Contains of Information about a volunteer that works from time to time at the zoo |
|7.| Account          |Contains information about existing places in the zoo like|
|8.| WorkerInfo       |Contains of basic information about people who work at zoo like first name|

### zoo/other

|Nr. | Class |Description |
| ---  | --- | --- |
|1.| PlaceInZoo        |Containts Information about Places that exist in the zoo like lion run, magazine|
|2.| CalenderDate      |Containts Information about made appointments like paying bills, and groups that visit the zoo|


### zoo/ware

|Nr. | Class |Description |
| ---  | --- | --- |
|1.| BuyWare           | Containts Information about purchased items for the zoo like food cleaning utilities|
|2.| MeatForAnimals    | Containt Information about Meat buyed for carnivorous animals|
|3.| Tools            | Containt Information about tools needed in zoo|
|4.| Vegetable        | Containt Information about vegetable that was buyed for animals|


## Diagram WIP
### Whole diagram


![test](https://github.com/user-attachments/assets/33528760-deef-4fed-a53d-fe0f7e1cea8c)

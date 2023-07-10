Даны две таблицы :
Persons со списком работников
Id	Name
1	Petya
2	Vasya
3	Kolya
Payments с зарплатными начислениями ежемесячно.
Id	Persons_id	Value
1		1		10
2		1		20
3		3		15
select person.name sum(payments.value) as total from Person person
Inner Join Payments payments on person.id = payments.person_id
Group by person.name
Having total>20
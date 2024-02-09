Au travers d'une illustration concrète, incarnée par une application bancaire de petite envergure, le présent atelier ambitionne d'évaluer le fonctionnement des services web en recourant à un service web bancaire, un client et SoapUI, outil dédié au test de services web SOAP. 

Architecture:

![Screenshot (1684)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/614a826d-b017-4a1c-a4e1-b942854efa6a)



Nous procédons ici à l'examen du contenu du fichier de description WSDL, révélant ainsi l'interface du service web. 

![Screenshot (1636)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/66bc6771-7d97-48a5-a678-eb718140d458)


Cette interface est conçue pour en faciliter l'usage par les utilisateurs ; elle détaille les différentes méthodes proposées par les services web, ainsi que leurs paramètres et les types de valeurs qu'elles retournent.

![Screenshot (1637)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/5f22ef51-b5dc-435d-9355-baacaee67da6)


L'usage de SoapUI s'avère indispensable pour tester les services web SOAP ; en fournissant l'URL du service web, l'utilisateur se voit offrir un environnement de test pour explorer les diverses méthodes disponibles.

![Screenshot (1639)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/05b20239-755a-4a0d-84f7-448cc458cfb9)



![Screenshot (1641)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/514d5613-2336-4d4a-b939-a59c19cc11e6)


Dans le cadre de cet exemple, un montant initial de 105 euros est soumis à conversion en dirham marocain, résultant en une valeur approximative de retour de 1107 MAD.

![Screenshot (1642)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/6bc6d4b2-3ec0-4cfe-8535-5c1fdb50075e)




![Screenshot (1643)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/9a0cb94e-9131-4e08-a191-0c6a70196fc6)




![Screenshot (1644)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/2f8dd975-58e2-49b7-80a8-5ce4abee473a)


![Screenshot (1645)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/b3f61dc7-bc6c-4fd9-857d-b567ee795f35)



![Screenshot (1646)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/eaa468a4-332b-40fa-b8e8-599b80dc19b9)




![Screenshot (1647)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/822bd240-41af-47c4-b926-f5708d7459bb)



Suite à l'instruction donnée à JAXB d'omettre l'attribut 'date de création', nous constatons qu'il ne figure désormais plus parmi les champs accessibles.

![Screenshot (1648)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/a6b2b298-5233-4991-bf1f-ed4ec658938a)





![Screenshot (1649)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/8e7f9833-6200-48e6-8d1f-efded10c8ce5)




![Screenshot (1650)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/c20e924a-898b-414c-a41b-879902d85198)



Étant donné que notre environnement de développement repose sur Java 17, il devient impératif d'intégrer la dépendance 'jaxws-ri' au sein du fichier pom.xml. Cette exigence contraste avec les situations où l'on opérerait sous Java 6, 7, ou 8, périodes durant lesquelles cette intégration n'aurait pas requis d'attention particulière, la fonctionnalité étant déjà incorporée au sein de ces versions.

![Screenshot (1651)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/f711e69c-2b37-4761-ac27-32504a7aae20)



Désormais, grâce à l'implémentation d'un 'Middleware stub', il est possible d'exploiter les fonctionnalités du service web depuis le côté client sans aucune contrainte.
![Screenshot (1652)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/5f279a50-0604-47ad-8711-df4c41e3b195)





![Screenshot (1653)](https://github.com/YassineAlami/Banque-Web-services-SOAP-WSDL/assets/40896739/7dfbe294-83a6-4b18-a486-167e78d6324a)


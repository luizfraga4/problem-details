# problem-details
Implementation of Problem Details in a Spring Boot project.

Call the end-point api/busca-dados-pessoa passing '12345678910' as the input prameter.
it should respond with the message 'CPF Válido'.

Now do it passing a different input like 987654321.
it should respond with the 406 http error handled with the problem details.
{
	"type": "about:blank",
	"title": "CPF informado não cadastrado.",
	"status": 406,
	"detail": "Necessário informar um CPF já cadastrado.",
	"instance": "/api/busca-dados-pessoa/1234567891",
	"TimeStamp": "2024-10-08T08:28:24.074396800Z"
}
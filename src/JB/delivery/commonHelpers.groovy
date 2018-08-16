package JB.delivery

@NonCPS
def getTextMessageParam(parameter_1, parameter_2)
{
    a1 = parameter_1.toUpperCase()
    a2 = parameter_2.toLowerCase()
    echo "Running parametrized method" 
    return "${a1} ${a2}"
} 

@NonCPS
def getTextMessage()
{
    a1 = "Thanks"
    a2 = "for your patience"
    return "${a1} ${a2}"
}

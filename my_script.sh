#Bash for codecov
#bash <(curl -s https://codecov.io/bash) -t $CODECOV_TOKEN

#Bash for codacy
bash <(curl -Ls https://coverage.codacy.com/get.sh) report -r target/test-results/jacoco/*.xml
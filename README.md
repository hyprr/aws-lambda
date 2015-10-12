##You have install AWS command line tools first. then off you go.


###1. build


```
lein uberjar
```


###2. create and upload

```Bash

# use this for the first time.
aws lambda create-function \
  --function-name clj-almiqi \
  --handler almiqi.core::handler \
  --runtime java8 \
  --memory 512 \
  --timeout 10 \
  --role arn:aws:iam::your-account-id:role/lambda_basic_execution \
  --zip-file fileb://./target/uberjar/almiqi-0.1.0-SNAPSHOT-standalone.jar




# use this after updating and rebuilding uberjar.
aws lambda update-function-code \
  --function-name clj-almiqi \
  --zip-file fileb://./target/uberjar/almiqi-0.1.0-SNAPSHOT-standalone.jar


```


###3. invoke your thing.

```Bash
aws lambda invoke \
     --function-name clj-almiqi \
     --invocation-type RequestResponse \
     --payload '"aoeuaeo"' outfile.txt

```

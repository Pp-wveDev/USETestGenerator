ECHO getting proccessed models...

cd ..
cd ..

REM RArm
java -jar USETestGenerator.jar "Testing\Phase2. Functional testing\RArm\RArm.use" RArm Random -10 10
move /y "Testing\Phase2. Functional testing\RArm\RArm_generated.use" "Testing\Phase2. Functional testing\RArm\Random\RArm_generated.use"

java -jar USETestGenerator.jar "Testing\Phase2. Functional testing\RArm\RArm.use" RArm Depth -10 10
move /y "Testing\Phase2. Functional testing\RArm\RArm_generated.use" "Testing\Phase2. Functional testing\RArm\Depth\RArm_generated.use"

java -jar USETestGenerator.jar "Testing\Phase2. Functional testing\RArm\RArm.use" RArm Breadth -10 10
move /y "Testing\Phase2. Functional testing\RArm\RArm_generated.use" "Testing\Phase2. Functional testing\RArm\Breadth\RArm_generated.use"

REM Microwave
java -jar USETestGenerator.jar "Testing\Phase2. Functional testing\Microwave\Microwave.use" Microwave Random -10 10
move /y "Testing\Phase2. Functional testing\Microwave\Microwave_generated.use" "Testing\Phase2. Functional testing\Microwave\Random\Microwave_generated.use"

java -jar USETestGenerator.jar "Testing\Phase2. Functional testing\Microwave\Microwave.use" Microwave Depth -10 10
move /y "Testing\Phase2. Functional testing\Microwave\Microwave_generated.use" "Testing\Phase2. Functional testing\Microwave\Depth\Microwave_generated.use"

java -jar USETestGenerator.jar "Testing\Phase2. Functional testing\Microwave\Microwave.use" Microwave Breadth -10 10
move /y "Testing\Phase2. Functional testing\Microwave\Microwave_generated.use" "Testing\Phase2. Functional testing\Microwave\Breadth\Microwave_generated.use"

ECHO done!
PAUSE
# 01. 목적

## 1. 업무에서의 변화와 확장에 대응

실제 개발 업무에서는 요구 사항 변경이나 기능 확장이 빈번히 발생합니다.
이를 효과적으로 관리하고 설계 품질을 유지하기 위해, 디자인 패턴을 적용할 수 있는 능력을 강화하고자 했습니다.

## 2. 기존 학습 내용 체계화

이전에 학습한 디자인 패턴을 단순 암기에서 벗어나, 실무 적용 관점에서 재정리.
이를 통해 각 패턴의 목적과 적합한 사용 사례를 명확히 이해하고 활용 가능하도록 했습니다.

## 3. 문제 해결 도구로서의 패턴 학습

디자인 패턴을 문제 해결 도구로 활용하여, 변화에 유연하게 대응하고 확장이 용이한 설계를 목표로 학습.


---

---

# 02. 디자인 패턴 분류

| **대분류**      | **관점**                    | **부가 설명**                                  | **패턴 목록**                                                                                                                                                                                                                                                                                                                                                                                   |
|-----------------|-----------------------------|-----------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **생성**     | 인스턴스 생성 관리          | 객체의 생성 방식을 제어하고 관리하는 패턴     | - [Singleton](src/main/java/org/designpattern/_01_creational/_1_instance_create_management/_1_singleton/singleton.md)  <br> - [Prototype](src/main/java/org/designpattern/_01_creational/_1_instance_create_management/_2_prototype/prototype.md)                                                                                                                                              |
|                 | 유연한 생성 관리            | 다양한 객체 생성 방식에 유연성을 제공         | - [Factory Method](src/main/java/org/designpattern/_01_creational/_2_flexible_creation/_1_factory_method/factoryMethod.md)  <br> - [Abstract Factory](src/main/java/org/designpattern/_01_creational/_2_flexible_creation/_2_abstract_factory/abstractFactory.md)  <br> - [Builder](src/main/java/org/designpattern/_01_creational/_2_flexible_creation/_3_builder/builder.md)             |
| **구조**     | 1 to 1 관계                | 두 객체 간의 연결이나 변환을 위한 구조         | - [Adapter](src/main/java/org/designpattern/_02_structural/_1_one_to_one/_1_adapter/adapter.md)  <br> - [Bridge](src/main/java/org/designpattern/_02_structural/_1_one_to_one/_2_bridge/bridge.md)  <br> - [Composite](src/main/java/org/designpattern/_02_structural/_1_one_to_one/_3_composite/composite.md)  <br> - [Decorator](src/main/java/org/designpattern/_02_structural/_1_one_to_one/_4_decorator/decorator.md) |
|                 | 1 to n 관계                | 여러 객체와의 관계를 단순화하거나 효율적으로 관리 | - [Facade](src/main/java/org/designpattern/_02_structural/_2_one_to_many/_1_facade/facade.md)  <br> - [Flyweight](src/main/java/org/designpattern/_02_structural/_2_one_to_many/_2_flyweight/flyweight.md)  <br> - [Proxy](src/main/java/org/designpattern/_02_structural/_2_one_to_many/_3_proxy/proxy.md)                                                                                     |
| **동작**     | 외부 상호작용             | 객체 간의 상호작용과 메시지 전달을 조율       | - [Chain Of Responsibility](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_1_chain_of_responsibility/chainOfResponsibility.md)  <br> - [Command](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_2_command/command.md)  <br> - [Interpreter](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_3_interpreter/interpreter.md) <br> - [Mediator](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_4_mediator/mediator.md) <br> - [Observer](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_5_observer/observer.md) <br> - [Strategy](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_6_strategy/strategy.md) <br> - [Visitor](src/main/java/org/designpattern/_03_behavioral/_1_external_communication/_7_visitor/visitor.md) |
|                 | 내부 동작 관리             | 객체 내부에서 상태와 로직을 관리              | - [Iterator](src/main/java/org/designpattern/_03_behavioral/_2_internal_behavior/_1_iterator/iterator.md)  <br> - [Memento](src/main/java/org/designpattern/_03_behavioral/_2_internal_behavior/_2_memento/memento.md)  <br> - [State](src/main/java/org/designpattern/_03_behavioral/_2_internal_behavior/_3_state/state.md)  <br> - [Template Method](src/main/java/org/designpattern/_03_behavioral/_2_internal_behavior/_4_template_method/templateMethod.md) |

---

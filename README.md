# Algoritmos y Estructuras de Datos desde Cero

Implementaciones manuales de estructuras de datos clásicas en Java, desarrolladas durante la cursada de **Estructuras y Algoritmos de Datos II**.  
Incluye listas, pilas, colas, árboles, tablas hash y grafos, en versiones **estáticas y dinámicas**, construidas sin librerías externas.

📌 Objetivo: Entender el funcionamiento interno, mejorar habilidades de programación y optimizar la lógica algorítmica.

---

## Estructuras implementadas

- **Árboles**
  - Árbol Binario
  - Árbol Binario de Búsqueda
  - Árbol AVL
  - Árbol N-ario
- **Listas**
  - Pilas Estáticas y Dinámicas
  - Colas Estáticas y Dinámicas
  - Colas de Árboles Binarios
- **Conjuntos**
  - Sets Estáticos y Dinámicos
- **Diccionarios**
  - Diccionarios Estáticos y Dinámicos
  - Diccionarios Múltiples
- **Colas de Prioridad**
  - Estáticas y Dinámicas
- **Grafos**
  - Representación mediante listas de adyacencia (estáticas y dinámicas)

También se implementaron estructuras auxiliares (nodos específicos) y clases de utilidades para operar sobre las principales estructuras.


---

## Estructura del proyecto

```
src/
├── adt/
│   ├── tree/
│   │   ├── BinaryTree.java
│   │   ├── DynamicBinaryTree.java
│   │   ├── DynamicNAryTree.java
│   │   ├── NAryTree.java
│   │   ├── StaticBinaryTree.java
│   │   ├── StaticNAryTree.java
│   │   ├── SearchBinaryTree.java
│   │   ├── DynamicSearchBinaryTree.java
│   │   └── SearchBinaryTreeUtil.java
│   ├── graph/
│   │   ├── Graph.java
│   │   └── StaticGraph.java
│   ├── list/
│   │   ├── Stack.java
│   │   ├── DynamicStack.java
│   │   ├── StaticStack.java
│   │   ├── Queue.java
│   │   ├── DynamicQueue.java
│   │   ├── StaticQueue.java
│   │   ├── QueueOfBT.java
│   │   └── DynamicQueueOfBT.java
│   ├── dictionary/
│   │   ├── Dictionary.java
│   │   ├── DynamicDictionary.java
│   │   ├── StaticDictionary.java
│   │   ├── MultipleDictionary.java
│   │   ├── DynamicMultipleDictionary.java
│   │   └── StaticMultipleDictionary.java
│   ├── set/
│   │   ├── Set.java
│   │   ├── DynamicSet.java
│   │   └── StaticSet.java
│   ├── priorityqueue/
│   │   ├── PriorityQueue.java
│   │   ├── DynamicPriorityQueue.java
│   │   └── StaticPriorityQueue.java
│   ├── nodos/
│   │   ├── Node.java
│   │   ├── KeyNode.java
│   │   ├── ValueNode.java
│   │   ├── PriorityNode.java
│   │   └── NodeOfBT.java
├── utils/
│   ├── BinaryTreeUtil.java
│   ├── DictionaryUtil.java
│   ├── GraphUtils.java
│   ├── PriorityQueueUtil.java
│   ├── QueueUtil.java
│   ├── SetUtil.java
│   ├── StackUtil.java
└── Main.java

```

Cada carpeta representa una categoría de estructuras, y cada clase implementa sus operaciones básicas como inserción, eliminación, búsqueda, recorrido, entre otros.

---

## Tecnologías utilizadas

- **Lenguaje:** Java 17
- **Entorno de desarrollo:** Eclipse IDE
- **Paradigma:** Programación Orientada a Objetos (POO)

---

## ¿Cómo ejecutar el proyecto?

1. Clonar este repositorio:

```bash
git clone https://github.com/juanseaddamo/Algoritmos_y_Estructuras_de_datos_deCero.git
```

2. Abrirlo en tu IDE de preferencia (Eclipse recomendado).
3. Modificar o crear nuevos casos de prueba según necesidad.

---

## ¿Por qué hice este proyecto?

- Para **aprender** a construir estructuras de datos manualmente, sin usar librerías.
- Para **entender** el manejo de memoria, nodos y referencias.
- Para **practicar** lógica de programación avanzada y técnicas algorítmicas.
- Para **prepararme** para entrevistas técnicas y futuros desafíos académicos y profesionales.

---

## Futuras mejoras (TODO)

- [ ] Agregar tests unitarios con JUnit.
- [ ] Implementar árboles B y B+.
- [ ] Extender los grafos a algoritmos clásicos (Dijkstra, Floyd, Prim, etc.).
- [ ] Documentar todas las clases con JavaDoc.
- [ ] Optimizar las implementaciones estáticas para mejor uso de memoria.

---

## Contacto

**Juan Segundo Addamo**  
📧 addamojuanse@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/juanseaddamo/)  
🔗 [GitHub](https://github.com/juanseaddamo)

---

# ¡Gracias por visitar el proyecto!

🚀 _Siempre construyendo desde las bases para llegar más alto._

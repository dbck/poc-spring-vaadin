# Based on 

1. https://vaadin.com/docs/flow/spring/tutorial-spring-basic.html
2. https://vaadin.com/learn/tutorials/modern-web-apps-with-spring-boot-and-vaadin/vaadin-basics-components-and-layouts

# Local development environment

## Compile / Install

```
mvn install
```

## Quality check

```
mvn -Dsonar.login=${SONAR_TOKEN} -Pquality verify
```

# Deployment

## Local

```
mvn verify
```

## Snapshot

```
git checkout main
git push
```

## Release

```
git checkout release
git merge main
git push
git checkout main
# After release is finished
git pull
```

# Debug profiles

```
mvn help:active-profiles
```

## Disable profiles

```
mvn help:active-profiles -P-github,-ossrh
```

# Maintenance

```
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
```
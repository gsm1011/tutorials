# Introduction

Docker provides a solutions to continuously deploy production code in a
controlled environment.

# Prerequisites

The following prerequisites must be met before installing docker. 

- 64-bit arch
- Linux kernel >= 3.8
- Have support of storage manager, including device mapper, aufs, vfs, btrfs
- `cgroups` and `namespace` kernel features should be supported. 

# Environment configuration

The following items need to be installed before using docker.

- A virtual machine such as VirtualBox
- docker-machine which is the daemon for managing the docker running
  environment
- docker, which is the client tool to interface with docker images and run
  docker instances etc.

# Get started

Once the environment is configured, we can build a simple docker images
with the `docker build .` coammand in the directory of this `README.md`
file .

``` bash
$ docker-machine create --driver virtualbox default
$ docker-machine start default
$ eval $(docker-machine env default)
$ docker build .
$ docker images
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
<none>              <none>              258d29d5d5b8        11 minutes ago      726.8 MB
$ docker tag 258d29d5d5b8 awscli
$ docker images
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
awscli              latest              258d29d5d5b8        11 minutes ago      726.8 MB
```

The last command shows that you just build the first docker image from the
given `Dockerfile` configuration. Now we can test drive the docker image
with command :

``` bash
$ docker run -it awscli --name=aws bash
```

If you want to save the changes to the images, you can do a `docker commit`
after stopping the container instance.

``` bash
$ docker commit aws_img aws
```

# Docker networking

There are 3 major ways for docker containers to connect to each other or to
the host machine.

- Use `--expose=<port>` when running the container, this will allow other
  docker containers to access the `<port>` on this docker container
  instance.

- Use `-p <port2>:<port1>` to *bind* the port `port1` on the docker container to the
  host machine on port `port2`.

- Use `--link=<container_name>` to link one container to another
  container. And in the *linked to* container, we will be able to access
  the linked server using the `container_name`.

# Docker storage

There are multiple ways to persist data stored for docker instances. 

- Use image itself, e.g. commit data as changes. 
- Create dedicated data docker images. 
- Mount storage from host machine.
- Shared storage that is mapped from the host machine 

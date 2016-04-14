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
$ docker run -it awscli bash
```

import showBlogs from '../components/showBlogs';
import addBlog from '../components/addBlog';
import listBlogs from '../components/listBlogs';

export default [
  { path: '/', component: showBlogs },
  { path: '/add', component: addBlog }
]
